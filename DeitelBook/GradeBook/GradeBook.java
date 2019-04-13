public class GradeBook{

    private String courseName; //nome do curso que este livro de nota representa
    private int[][] grades; //array bidimensional de notas de aluno

    //construtor de dois argumentos inicializa courseName e aray de notas
    public GradeBook( String name, int [][] gradesArray) {
        courseName = name;
        grades = gradesArray;
    }

    public void setCourseName( String name ) {
        courseName = name; //armazena o nome do curso        
    }

    public String getCourseName(){
        return courseName;
    }

    public void displayMessage(){
        System.out.printf( "Welcome to the grade book for \n%s! \n \n", getCourseName() );
    }

    public void processGrades(){
        
        outputGrades();

        System.out.printf( "\n%s %d\n%s %d\n\n", "Lowest grade in the book is", getMinimum(), 
        "Highest grade in the book is", getMaximum() );

        outputBarChart();
    }

    public int getMinimum(){

        //assume que o primeiro elemento do array de notas é o menor
        int lowGrade = grades[0][0];

        //faz um loop pelas linhas do array de notas
        for( int[] studentGrades : grades ){
            //faz um loop pelas colunas do arrat de notas
            for( int grade : studentGrades){
                //se a nota for menor que lowGrade, atribui a nota a lowGrade
                if(grade < lowGrade)
                    lowGrade = grade;
            }
        }
        return lowGrade;
    }

    public int getMaximum(){

        //assume que o primeiro elemento do array de notas é o maior
        int highGrade = grades[0][0];

        //faz um loop pelas linhas do array de notas
        for( int[] studentGrades : grades ){
            //faz um loop pelas colunas do arrat de notas
            for( int grade : studentGrades){
                //se a nota for menor que highGrade, atribui a nota a highGrade
                if(grade > highGrade)
                    highGrade = grade;
            }
        }
        return highGrade;
    }

    //determina a média de um conjunto partticular de notas
    public double getAverage(int[] setOfGrades){
        int total = 0;

        //soma notas de um aluno
        for( int grade : setOfGrades)
            total += grade;

        //retorna a média de notas
        return (double)total/setOfGrades.length;
    }

    //gera saída do gráfico de barras para exibir distribuição total de notas
    public void outputBarChart(){
        System.out.println("Overall grade distribution: ");

        //armazena frequência de notas em cada intervalo de 10 notas
        int[] frequency = new int[11];

        //para cada nota em GradeBook, incrementa a frequência certa
        for( int[] studentGrades : grades){
            for(int grade : studentGrades)
                ++frequency[grade/10];
        }

        //para cada frequência de nota, imprime barra no gráfico
        for(int count = 0; count < frequency.length ; count++){
            //imprime rótulo de barra ("00-09: " ..., "90-99: ", "100: ")
            if (count == 10) {
                System.out.printf("%5d: ", 100);
            } else {
                System.out.printf("%02d-%02d: ", count*10, count * 10 + 9);
            }

            //imprime a barra de asteriscos
            for(int stars = 0 ; stars < frequency[count] ; stars++ )
                System.out.print("*");

            System.out.println(); //indica uma nova saida de linha
        }
    }

    public void outputGrades(){
        System.out.println("The grades are:\n");
        System.out.print("            "); // alinha títulos de coluna

        //cria um titulo de coluna para cada um dos testes
        for( int test = 0 ; test < grades[0].length ; test++ )
            System.out.printf( "Test %d ", test+1);

            System.out.println("Average"); //título da coluna de média do aluno

            //cria linhas/colunas de texto que representam notas de array
            for( int student = 0; student < grades.length ; student++ ){
                System.out.printf("Student %2d", student + 1);

                for( int test : grades[student])//gera saída de notas de aluno
                    System.out.printf("%8d", test);

                //chama método getAverage para calcular a média do aluno;
                //passa linha de notas como o argumento para getAverage
                double average = getAverage(grades[student]);
                System.out.printf("%9.2f\n", average);
            }
    }
}
