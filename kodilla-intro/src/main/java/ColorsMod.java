public class ColorsMod {
    public double calculate2() {
        String userSelected2 = Colors.getUserSelection2();
        int b = Colors.getValue2();
        int r = Colors.getValue2();
        int y = Colors.getValue2();
       int g = Colors.getValue2();

        switch (userSelected2) {
            case "Blue": return b;
            case "Red": return r;
            case "Yellow": return y;
            case "Green": return g;
            default:
                return 0;

        }
    }}
