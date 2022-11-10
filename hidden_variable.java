class ab{
    static int x;
    ab()
    {
        x = 100;
    }
}

class hidden_variable extends ab {
    int x=500;

    void display()
    {
        System.out.println("Value of X in Class A :: "+ab.x);
        System.out.println("Value of X in Class B :: "+x);
    }
    public static void main(String[] args) {


        hidden_variable ob = new hidden_variable();

        ob.display();

    }
}
