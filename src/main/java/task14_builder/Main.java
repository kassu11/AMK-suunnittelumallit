package task14_builder;

public class Main {
    public static void main(String[] args) {
        HesburgerBuilder hesburgerBuilder = new HesburgerBuilder();
        McDonaldsBuilder mcDonaldsBuilder = new McDonaldsBuilder();

        CashierWorker worker = new CashierWorker();
        worker.setBurgeriBuilder(hesburgerBuilder);
        worker.constructBurger();
        VegeBurger hesburger = (VegeBurger) worker.getBurger();
        System.out.println(hesburger);

        System.out.println("-----------------------");

        worker.setBurgeriBuilder(mcDonaldsBuilder);
        worker.constructBurger();
        BeefBurger mcDonalds = (BeefBurger) worker.getBurger();
        System.out.println(mcDonalds);

        System.out.println("-----------------------");

        worker.constructMegaBurger();
        mcDonalds = (BeefBurger) worker.getBurger();
        System.out.println(mcDonalds);
    }
}
