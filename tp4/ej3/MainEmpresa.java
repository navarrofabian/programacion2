package tp4.ej3;

public class MainEmpresa {

    public static void main(String[] args){

        EmpFijo eF1 = new EmpFijo(100000.0);
        EmpPorHora ePH1 = new EmpPorHora(100000.0, 20);
        EmpComision eC1 = new EmpComision(100000.0);


        System.out.println(eF1.getSalario());
        System.out.println(ePH1.getSalario());
        System.out.println(eC1.getSalario());
    }
}
