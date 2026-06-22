public class day14_factory {
    interface notification{
        void send(String to,String message);
    }
    class creditnotification implements notification{
        @Override
        public void send(String to,String message){
            System.out.println("sending credit:"+message+",to"+to);
        }
    }
    class Debitnotification implements notification{
        @Override
        public void send(String to,String message){
            System.out.println("sending Debit:"+message+",to"+to);
        }
    }
    static notification getnotification(day14_factory factory,String type) {
        return switch (type) {
            case "credit" -> factory.new creditnotification();
            case "Debit" -> factory.new Debitnotification();
            default -> throw new IllegalArgumentException("Invalid notification type: " + type);
        };
    }
    static void main(){
        day14_factory factory=new day14_factory();
        String type="Debit";
        getnotification(factory,type).send("abc@gmail.com","your account debit 800 rupee");
        }
        }


