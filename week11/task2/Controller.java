public class Controller {
    void runController() {
        double userIn = Dialog.doDiag();
        double moms = VAT.doVAT(userIn);
        View.doView(moms, Main.MSG);
    }
}
