import java.util.stream.IntStream;

/**
 * LambdaTest
 */
public class LambdaTest {

    public static void main(String[] args) {
        
        int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};

        // exibe valores originais
        System.out.print("Original values: ");
        IntStream.of(values).forEach(value -> System.out.print(value + " "));
        System.out.println();
                
        // count, min, max, sum e average dos valores
        System.out.printf("%nCount: %d%n", IntStream.of(values).count());
        System.out.printf("Min: %d%n",
        IntStream.of(values).min().getAsInt());

        System.out.printf("Max: %d%n",
        IntStream.of(values).max().getAsInt());

        System.out.printf("Sum: %d%n", IntStream.of(values).sum());

        System.out.printf("Average: %.2f%n",
        IntStream.of(values).average().getAsDouble());

        // soma dos valores com o método reduce
        System.out.printf("%nSum via reduce method: %d%n",
        IntStream.of(values)
            .reduce(0, (x, y) -> x + y));

        // soma das raízes quadradas dos valores com o método reduce
        System.out.printf("Sum of squares via reduce method: %d%n",
        IntStream.of(values)
            .reduce(0, (x, y) -> x + y * y));
            
        // produto dos valores com o método reduce
        System.out.printf("Product via reduce method: %d%n",
        IntStream.of(values) 
            .reduce(1, (x, y) -> x * y));

        // valores pares exibidos em ordem classificada
        System.out.printf("%nEven values displayed in sorted order: ");
        IntStream.of(values) 
            .filter(value -> value % 2 == 0) 
            .sorted() 
            .forEach(value -> System.out.printf("%d ", value));
        System.out.println();

        // valores ímpares multiplicados por 10 e exibidos em ordem classificada
        System.out.printf(
        "Odd values multiplied by 10 displayed in sorted order: ");
        IntStream.of(values) 
            .filter(value -> value % 2 != 0) 
            .map(value -> value * 10) 
            .sorted() 
            .forEach(value -> System.out.printf("%d ", value));
        System.out.println();

        // soma o intervalo dos números inteiros de 1 a 10, exclusivo
        System.out.printf("%nSum of integers from 1 to 9: %d%n",
        IntStream.range(1, 10).sum());

        // soma o intervalo dos números inteiros de 1 a 10, inclusive
        System.out.printf("Sum of integers from 1 to 10: %d%n",
        IntStream.rangeClosed(1, 10).sum());

    }
}

/*
IntStream é um fluxo, pq pode fazer operações em fluxo(kkk)

IntStream.of() é um metodo q recebe um ou mais int(ou array)
e retorna um fluxo que pode ser manipulado

IntStream.range(,) e IntStream.rangeClosed(,) criam fluxos
com um determinado sseguimento(range, de tal até tal)

o IntStream.forEach() é exatamente um forEach, ele realiza
uma atividade para cada valor do fluxo
o .min() retorna o menor valor, enquanto o .max() faz o contrario
.average() retorna a media, e .summaryStatistics() faz tudo isso
.getAsInt() retorna o fluxo em Int, e o getAsDouble() em double
eles normalmente ja retornam um int e double(mas optional)

.reduce(,) trabalha com dois valores,
o primeiro valor é um int, e valor inicial de trabalho do x
o segundo é a interface q usaremos o lambda
essa interface recebe dois valores, e vai passando cada um deles
sendo q o parametro x começa com o valor inicial citado em cima
e depois ele vai sendo o resultado retornado pelo metodo
enquanto o prametro y é os valores do fluxo sendo trocados

com operações "preguiçosas" fazemos um pipeline fluxo
ou seja, dizemos como processar o fluxo, e quando uma operação
gulosa é chamada o fluxo é processado
.filter() recebe um valor numerico de parametro,
e precisa retornar um valor booleano(o qual é imprementado dentro)
assim faz um filtro onde apenas os valores que retornaram true ficam
podemos usar operadores booleanos em funções tambem
são o .and() .or() e .not()
i.e: 
'IntPredicate even = value -> value % 2 == 0;'
'IntPredicate greaterThan5 = value -> value > 5;'
'even.and(greateThan5)'

.sorted() faz um sort na ordem natural
.map() recebe os valores, retorna outros e altera no fluxo
com os valores retornados
*/