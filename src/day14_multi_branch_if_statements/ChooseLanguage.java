package day14_multi_branch_if_statements;

    public class ChooseLanguage {
        public static void main(String[] args) {
            int selection = 1;
            if (selection == 1) {
                System.out.println("Thank you for your call");
            } else if (selection == 2) {
                System.out.println("Halo, gracias para llamar");
            } else if (selection == 3) {
                System.out.println("Merhaba, aradiginiz icin tessekkurler");
            } else if (selection == 4) {
                System.out.println("Privet, spasibo za vash zvonok");
            } else if (selection == 5) {
                System.out.println("Merci,pour votre appel");
            } else {
                System.out.println("Lets talk java and english, Hello");
            }
        }
    }