package Chatbot;

import java.util.HashMap;

public class Network{

    HashMap<int, double> fB   = new HashMap<int, double>();
    HashMap<int, double> iB   = new HashMap<int, double>();
    HashMap<int, double> oB   = new HashMap<int, double>();
    HashMap<int, double> cB   = new HashMap<int, double>();
    HashMap<int, double> fWx  = new HashMap<int, double>();
    HashMap<int, double> iWx  = new HashMap<int, double>();
    HashMap<int, double> oWx  = new HashMap<int, double>();
    HashMap<int, double> cWx  = new HashMap<int, double>();
    HashMap<int, double> fWlh = new HashMap<int, double>();
    HashMap<int, double> iWlh = new HashMap<int, double>();
    HashMap<int, double> oWlh = new HashMap<int, double>();
    HashMap<int, double> cWlh = new HashMap<int, double>();

    public static double GetIDVar(int ID, String Class) {
        double Ans = 0.0;
        switch(Class) {
            case "fB":
                for (int i : fB.keySet()) {
                    Ans = fB.get(i);
                    break;
                }
            break;
            case "iB":
                for (int i : iB.keySet()) {
                    Ans = iB.get(i);
                    break;
                }
            break;
            case "oB":
                for (int i : oB.keySet()) {
                    Ans = oB.get(i);
                    break;
                }
            break;
            case "cB":
                for (int i : cB.keySet()) {
                    Ans = cB.get(i);
                    break;
                }
            break;
            case "fWx":
                for (int i : fWx.keySet()) {
                    Ans = fWx.get(i);
                    break;
                }
            break;
            case "iWx":
                for (int i : iWx.keySet()) {
                    Ans = iWx.get(i);
                    break;
                }
            break;
            case "oWx":
                for (int i : oWx.keySet()) {
                    Ans = oWx.get(i);
                    break;
                }
            break;
            case "cWx":
                for (int i : cWx.keySet()) {
                    Ans = cWx.get(i);
                    break;
                }
            break;
            case "fWlh":
                for (int i : fWlh.keySet()) {
                    Ans = fWlh.get(i);
                    break;
                }
            break;
            case "iWlh":
                for (int i : iWlh.keySet()) {
                    Ans = iWlh.get(i);
                    break;
                }
            break;
            case "oWlh":
                for (int i : oWlh.keySet()) {
                    Ans = oWlh.get(i);
                    break;
                }
            break;
            case "cWlh":
                for (int i : cWlh.keySet()) {
                    Ans = cWlh.get(i);
                    break;
                }
            break;
            default:
                // You Royaly messed up bro.
            break;
        }
        return Ans;
    }

    public static void PushIDVar (int ID, String Class, double Replacement_value) {
        switch(Class) {
            case "fB":
                for (int i : fB.keySet()) {
                    fB.replace(i, Replacement_value);
                    break;
                }
            break;
            case "iB":
                for (int i : iB.keySet()) {
                    iB.replace(i, Replacement_value);
                    break;
                }
            break;
            case "oB":
                for (int i : oB.keySet()) {
                    oB.replace(i, Replacement_value);
                    break;
                }
            break;
            case "cB":
                for (int i : cB.keySet()) {
                    cB.replace(i, Replacement_value);
                    break;
                }
            break;
            case "fWx":
                for (int i : fWx.keySet()) {
                    fWx.replace(i, Replacement_value);
                    break;
                }
            break;
            case "iWx":
                for (int i : iWx.keySet()) {
                    iWx.replace(i, Replacement_value);
                    break;
                }
            break;
            case "oWx":
                for (int i : oWx.keySet()) {
                    oWx.replace(i, Replacement_value);
                    break;
                }
            break;
            case "cWx":
                for (int i : cWx.keySet()) {
                    cWx.replace(i, Replacement_value);
                    break;
                }
            break;
            case "fWlh":
                for (int i : fWlh.keySet()) {
                    fWlh.replace(i, Replacement_value);
                    break;
                }
            break;
            case "iWlh":
                for (int i : iWlh.keySet()) {
                    iWlh.replace(i, Replacement_value);
                    break;
                }
            break;
            case "oWlh":
                for (int i : oWlh.keySet()) {
                    oWlh.replace(i, Replacement_value);
                    break;
                }
            break;
            case "cWlh":
                for (int i : cWlh.keySet()) {
                    cWlh.replace(i, Replacement_value);
                    break;
                }
            break;
            default:
                // You Royaly messed up bro.
            break;
        }
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

        double Ct = (f * lCt) + (i * pc);
        double Ht = o * tanh(Ct);
        return [Ct, Ht];
    }
}
