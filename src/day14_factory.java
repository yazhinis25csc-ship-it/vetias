public class day14_factory {
    interface notification{
        void send(String to,String message);
    }
    class Emailnotification implements notification{
        @Override
        public void send(String to,String message){
            System.out.println("sending Email:"+message+",to"+to);
        }
    }
    class Whatsappnotification implements notification{
        @Override
        public void send(String to,String message){
            System.out.println("sending whatsapp:"+message+",to"+to);
        }
    }
    static notification getnotification(day14_factory factory,String type) {
        return switch (type) {
            case "Email" -> factory.new Emailnotification();
            case "whatsapp" -> factory.new Whatsappnotification();
            default -> throw new IllegalArgumentException("Invalid notification type: " + type);
        };
    }
    static void main(){
        day14_factory factory=new day14_factory();
        String type="Email";
        getnotification(factory,type).send("abc@gmail.com","program exceuted successfully");
        }
        }


