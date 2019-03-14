package creational.builder;

public class StringBuilderDemo {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();

        builder.append("This is an example ");
        builder.append("of the builder pattern.");
        builder.append("It has methods to append ");
        builder.append("almost anything we want to a String. ");
        builder.append(1);
        builder.append(300);

        System.out.println(builder.toString());

    }
}
