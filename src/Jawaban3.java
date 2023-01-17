import java.util.ArrayList;
import java.util.Scanner;

    public class Jawaban3 {
        private String messageId;
        private String messageName;
        private ArrayList<String> context;

        public Jawaban3() {
            this.messageId = messageId;
            this.messageName = messageName;
            this.context = context;
        }

        public Jawaban3(String messageId, String messageName) {
            this.messageId = messageId;
            this.messageName = messageName;
            this.context = new ArrayList<String>();
        }

        // Getter and Setter methods
        public String getMessageId() {
            return messageId;
        }

        public void setMessageId(String messageId) {
            this.messageId = messageId;
        }

        public String getMessageName() {
            return messageName;
        }

        public void setMessageName(String messageName) {
            this.messageName = messageName;
        }

        public ArrayList<String> getContext() {
            return context;
        }

        public void setContext(ArrayList<String> context) {
            this.context = context;
        }

        public String FindWords(ArrayList<String> context,String word) {
            ArrayList<Integer> indexes = new ArrayList<Integer>();
            for(int i = 0; i < context.size(); i++) {
                if(context.get(i).equals(word)) {
                    indexes.add(i);
                }
            }
            if(indexes.size() == 0) {
                return "Word '" + word + "' not found in context.";
            }
            else {
                String result = "Word '" + word + "' found at index positions: ";
                for(int i = 0; i < indexes.size(); i++) {
                    result += " " + indexes.get(i);
                }
                return result;
            }
        }

        public static void main(String[] args) {
            int jum=4;
            Jawaban3 myMessage =  new Jawaban3();
            Scanner sc = new Scanner(System.in);
            myMessage.setMessageId(sc.nextLine());
            myMessage.setMessageName(sc.nextLine());
            ArrayList<String> context = new ArrayList<>();
            for(int index=0; index<jum;index++){
                context.add(sc.nextLine());
            }
            myMessage.setContext(context);
            System.out.print("Kata yang dicari : ");
            String cari = sc.nextLine();
            System.out.println(myMessage.FindWords(context,cari));
        }
    }


