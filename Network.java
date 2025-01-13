package Chatbot;

// import

public class Network{

    public static double GetIDVar(int ID, String class) {
        // Place holder
    }

    public static double PushIDVar(int ID, String class, double x) {
        // Place holder
    }

    public static double[] LSTM(int ID, double Xt, double lCt, double lHt) {
        double sigmoid(double x) {
            return 1 / (1 + Math.exp(x));
        }

        double tanh(double x) {
            return Math.tanh(x);
        }

        double f = sigmoid((GetIDVar(ID, "fWx") * Xt) + (GetIDVar(ID, "fWlh") * lHt) + GetIDVar(ID, "fB"));
        double i = sigmoid((GetIDVar(ID, "iWx") * Xt) + (GetIDVar(ID, "iWlh") * lHt) + GetIDVar(ID, "iB"));
        double o = sigmoid((GetIDVar(ID, "oWx") * Xt) + (GetIDVar(ID, "oWlh") * lHt) + GetIDVar(ID, "oB"));

        double c = tanh  ((GetIDVar(ID, "cWx") * Xt) + (GetIDVar(ID, "cWlh") * lHt) + GetIDVar(ID, "cB"));

        double C = (f * lCt) + (i * pc);
        return [1,1,1];
    }
}
