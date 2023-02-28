public class FormaFor {
    public static void main(String[] args) {
        for (int i=1; i<7;i++){
            for (int j=1; j<=12; j++){
                if(i==1 || i==6){
                    if(j==1 || j==12){
                        System.out.print("+");
                    } else if (j % 2 == 0) {
                        System.out.print("<");
                    } else{
                        System.out.print(">");
                    }
                }
                if (i==3 || i==4){
                    if (j==1 || j==12){
                        System.out.print("|");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }



    }
}
