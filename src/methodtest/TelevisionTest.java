package methodtest;

class Television {
    private String model;

    void setModel(String b) {
        model = b;
    }

    // 1.
    String getModel() {
        return model;
    }
}

public class TelevisionTest {
    public static void main(String[] args) {
        Television t = new Television();
        t.setModel("STV-101");

        // 2.
        String b = t.getModel();
        System.out.println(b);
    }
}
