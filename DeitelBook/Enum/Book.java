/**
 * Book
 */
public enum Book {

    //declara constantes do tipo enum
    //(creio que posso imaginar o tipo implicitamente, assim como o final e o static)
    JHTP("Java How to Program", "2010"), 
    CHTP("C How to Program", "2007"),
    IW3HTP("Internet % World Wide We How to Program", "2008"),
    CPPHTP("C++ How to Program", "2008"),
    VBHTP("Visual Basic 2008 How to Program", "2009"),
    CSHARPHTP("Visual C# 2008 How to Program", "2009");

    //campos de instância
    private final String title; // título do livro
    private final String copyrightYear; // ano dos direitos autorais

    //construtor enum
    Book(String bookTitle, String year){
        title = bookTitle;
        copyrightYear = year; 
    }

    public String getTitle() {
        return title;
    }

    public String getCopyrightYear() {
        return copyrightYear;
    }
}