import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int ay,gun;
        String burc= "";

        Scanner input = new Scanner(System.in);

        System.out.println(" BURÇ HESAPLAMA");

        System.out.print("Doğduğunuz ay(rakamla):");
        ay=input.nextInt();
        System.out.print("Doğduğunuz gün(rakamla):");
        gun=input.nextInt();

        if(ay==1) {
            if(gun >= 1 && gun<=31)
                if(gun<22){
                    burc="Oglak burcu";

                }else
                    burc="Kova burcu";
        }

        if(ay==2) {
            if(gun >= 1 && gun <=28)
                if(gun<20){
                    burc="Kova burcu";
                }else
                    burc="Balik burcu";


        }

        if(ay==3) {
            if(gun >= 1 && gun<=31)
                if(gun<21){
                    burc="Balik burcu";

                }else
                    burc="Koc burcu";
        }

        if(ay==4) {
            if(gun >= 1 && gun<=30)
                if(gun<21){
                    burc="Koc burcu";

                }else
                    burc="Boga burcu";
        }

        if(ay==5) {
            if(gun >= 1 && gun<=31)
                if(gun<22){
                    burc="Boga burcu";

                }else
                    burc="Ikizler burcu";
        }

        if(ay==6) {
            if(gun >= 1 && gun<=30)
                if(gun<23){
                    burc="Ikizler burcu";

                }else
                    burc="Yengec burcu";
        }

        if(ay==7) {
            if(gun >= 1 && gun<=31)
                if(gun<23){
                    burc="Yengec burcu";

                }else
                    burc="Aslan burcu";
        }

        if(ay==8) {
            if(gun >= 1 && gun<=31)
                if(gun<22){
                    burc="Aslan burcu";

                }else
                    burc="Basak burcu";
        }

        if(ay==9) {
            if(gun >= 1 && gun<=30)
                if(gun<23){
                    burc="Basak burcu";

                }else
                    burc="Terazi burcu";
        }

        if(ay==10) {
            if(gun >= 1 && gun<=31)
                if(gun<23){
                    burc="Terazi burcu";

                }else
                    burc="Akrep burcu";
        }

        if(ay==11) {
            if(gun >= 1 && gun<=30)
                if(gun<22){
                    burc="Akrep burcu";

                }else
                    burc="Yay burcu";
        }

        if(ay==12) {
            if(gun >= 1 && gun<=31)
                if(gun<22){
                    burc="Yay burcu";

                }else
                    burc="Kova burcu";
        }
        System.out.print("Burcunuz : " + burc);


    }
}
