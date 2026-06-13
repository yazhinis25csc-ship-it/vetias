/*public class Day7 {
    static class Request {
        String to;
        Request(String to) {
            this.to = to;
        }
        void request() {
            System.out.println("Request sent to " + to);
        }
    }
    static class OndutyRequest extends Request {
        OndutyRequest(String to) {
            super(to);
        }
        void request() {
            System.out.println("Approved");
        }
    }
    public static void main(String[] args) {
        OndutyRequest obj = new OndutyRequest("HOD");
        obj.request();
    }
}
 obj.request(  )*/

import com.sun.net.httpserver.Request;

/*public class Day7{
    static class Request{
        String name;
        String date;
        String reason;
        Request(String name, String date, String reason){
            this.name = name;
            this.date = date;
            this.reason = reason;
        }
        void approve() {
            System.out.println("Approving request");
        }
        void reject() {
            System.out.println("Reject request");
        }
    }
    static class LeaveRequest extends Request {

        LeaveRequest(String name, String date, String reason) {
            super(name, date, reason);
        }
        void approveLeaveRequest() {
            System.out.println("Approving leave request");
        }
        void rejectLeaveRequest() {
            System.out.println("Reject leave request");
        }
    }
    static class OnDutyRequest extends Request {
        OnDutyRequest(String name, String date, String reason) {
            super(name, date, reason);
        }
        void approveOnDutyRequest() {
            System.out.println("Approving on duty request");
        }
        void rejectOnDutyRequest() {
            System.out.println("Reject on duty request");
        }
    }
    static void main() {
        LeaveRequest leaveRequest = new LeaveRequest("Menaga","12.06.2026","cold");
        leaveRequest.approveLeaveRequest();
        OnDutyRequest onDutyRequest = new OnDutyRequest("Menaga","11.07.2026","Culturals");
        onDutyRequest.rejectOnDutyRequest();
    }
}*/

public class Day7{
    static class payment{
        String Amount;

         void transfer(){
             System.out.println("make a transfer");
        }
    }
    static class upipayment extends payment{
        @Override
        void transfer() {
            System.out.println("upipayment");
        }
    }
    static class cardpayment extends payment{
    void transfer(){
        System.out.println("Cardpayment");
    }
    }
    static class Netbankingpayment extends payment{
        void transfer(){
            System.out.println("Netbankingpayment");
        }
    }
     static void main(){
        upipayment upipayment=new upipayment();
        upipayment.transfer();

             cardpayment cardpayment=new cardpayment();
             cardpayment.transfer();

             Netbankingpayment Netbankingpayment=new Netbankingpayment();
             Netbankingpayment.transfer();
         }
         }


