package Design_Patterns.Solid_Principle.Open_Closed_Principle;

public class AddOperation implements Operation {

    @Override
    public int perform(int a, int b) {
        return a+b;
    }
}