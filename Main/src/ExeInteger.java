public class ExeInteger {
    public static void main(String[] args) {
        Integer valor1 = 51;
        Integer valor2 = 52;
        int comparar;


        if(valor1.equals(valor2)){
            System.out.println("Sao iguais");
        }else{
            comparar=valor1.compareTo(valor2);
            if(comparar>0)
                System.out.println("valor1 é maior que valor2");
            else
                System.out.println("valor2 é maior que valor1");
        }
    }


}
