
public class Book {
    private int noOfCopies;

    // constructor
    Book(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    public int getBook() {
        return noOfCopies;
    }

    public void setNoOfCopies(int noOfCopies) {
        if (noOfCopies > 0)
            this.noOfCopies = noOfCopies;
    }

    public void increaseNoOfCopeis(int howMuch) {
        this.noOfCopies = noOfCopies + howMuch;
    }

    public static void main(String[] args) {
        Book computer = new Book(20);
        Book java = new Book(30);
        computer.setNoOfCopies(20);
        java.setNoOfCopies(30);
        System.out.println(computer.getBook());
        computer.increaseNoOfCopeis(10);

    }
}
