class billRunner {

public static void main(String []plans) {
System.out.println("main started");
/*Bill.planType="Quaterly Plan";
Bill.billId="B-01";
Bill.billAmount=1000.00;
Bill.paymentMethod="UPI";
Bill.isBillPaid=false;*/

Bill ref1=new Bill();
ref1.billId=1;
ref1.planType="Monthly plan";
ref1.billAmount=550.81;
ref1.billIssueDate="20-07-2025";
ref1.paymentMethod="UPI";
ref1.dueDate="26-07-2025";
ref1.billAmountWithTax=557.00;
ref1.isTaxInclusive=true;
ref1.isBillPaid=true;
ref1.isBillOverDue=false;

System.out.println("The first ref Id : "+ref1.billId);
System.out.println("Bill plan: "+ref1.billAmountWithTax);
System.out.println("Plan type: "+ref1.planType);
System.out.println("Bill amount: "+ref1.billAmount);
System.out.println("Bill issued date: "+ref1.billIssueDate);
System.out.println("Payment method: "+ref1.paymentMethod);
System.out.println("Due date: "+ref1.dueDate);
System.out.println("The bill amount with tax : "+ref1.billAmountWithTax);
System.out.println("Is Tax included : "+ref1.isTaxInclusive);
System.out.println("Is bill paid : "+ref1.isBillPaid);
System.out.println("Is bill over due : "+ref1.isBillOverDue);


Bill ref2=new Bill();
ref2.billId=2;
ref2.planType="Unilimited calls plan";
ref2.billAmount=249.00;
ref2.billIssueDate="23-07-2025";
ref2.paymentMethod="UPI";
ref2.dueDate="26-07-2025";
ref2.billAmountWithTax=251.90;
ref2.isTaxInclusive=true;
ref2.isBillPaid=false;
ref2.isBillOverDue=false;

System.out.println("The first ref Id : "+ref2.billId);
System.out.println("Bill plan: "+ref2.billAmountWithTax);
System.out.println("Plan type: "+ref2.planType);
System.out.println("Bill amount: "+ref2.billAmount);
System.out.println("Bill issued date: "+ref2.billIssueDate);
System.out.println("Payment method: "+ref2.paymentMethod);
System.out.println("Due date: "+ref2.dueDate);
System.out.println("The bill amount with tax : "+ref2.billAmountWithTax);
System.out.println("Is Tax included : "+ref2.isTaxInclusive);
System.out.println("Is bill paid : "+ref2.isBillPaid);
System.out.println("Is bill over due : "+ref2.isBillOverDue);

Bill ref3=new Bill();
ref3.billId=3;
ref3.planType="Unilimited calls plan";
ref3.billAmount=249.00;
ref3.billIssueDate="20-08-2025";
ref3.paymentMethod="Cash";
ref3.dueDate="26-08-2025";
ref3.billAmountWithTax=251.90;
ref3.isTaxInclusive=true;
ref3.isBillPaid=false;
ref3.isBillOverDue=false;

System.out.println("The first ref Id : "+ref3.billId);
System.out.println("Bill plan: "+ref3.billAmountWithTax);
System.out.println("Plan type: "+ref3.planType);
System.out.println("Bill amount: "+ref3.billAmount);
System.out.println("Bill issued date: "+ref3.billIssueDate);
System.out.println("Payment method: "+ref3.paymentMethod);
System.out.println("Due date: "+ref3.dueDate);
System.out.println("The bill amount with tax : "+ref3.billAmountWithTax);
System.out.println("Is Tax included : "+ref3.isTaxInclusive);
System.out.println("Is bill paid : "+ref3.isBillPaid);
System.out.println("Is bill over due : "+ref3.isBillOverDue);

Bill ref4=new Bill();
ref4.billId=4;
ref4.planType="International Roaming plan";
ref4.billAmount=549.00;
ref4.billIssueDate="20-08-2025";
ref4.paymentMethod="Cash";
ref4.dueDate="26-08-2025";
ref4.billAmountWithTax=557.90;
ref4.isTaxInclusive=true;
ref4.isBillPaid=false;
ref4.isBillOverDue=false;

System.out.println("The first ref Id : "+ref4.billId);
System.out.println("Bill plan: "+ref4.billAmountWithTax);
System.out.println("Plan type: "+ref4.planType);
System.out.println("Bill amount: "+ref4.billAmount);
System.out.println("Bill issued date: "+ref4.billIssueDate);
System.out.println("Payment method: "+ref4.paymentMethod);
System.out.println("Due date: "+ref4.dueDate);
System.out.println("The bill amount with tax : "+ref4.billAmountWithTax);
System.out.println("Is Tax included : "+ref4.isTaxInclusive);
System.out.println("Is bill paid : "+ref4.isBillPaid);
System.out.println("Is bill over due : "+ref4.isBillOverDue);

Bill ref5=new Bill();
ref5.billId=5;
ref5.planType="Data plan";
ref5.billAmount=199.00;
ref5.billIssueDate="01-09-2025";
ref5.paymentMethod="Card";
ref5.dueDate="05-09-2025";
ref5.billAmountWithTax=203.98;
ref5.isTaxInclusive=true;
ref5.isBillPaid=true;
ref5.isBillOverDue=false;

System.out.println("The first ref Id : "+ref5.billId);
System.out.println("Bill plan: "+ref5.billAmountWithTax);
System.out.println("Plan type: "+ref5.planType);
System.out.println("Bill amount: "+ref5.billAmount);
System.out.println("Bill issued date: "+ref5.billIssueDate);
System.out.println("Payment method: "+ref5.paymentMethod);
System.out.println("Due date: "+ref5.dueDate);
System.out.println("The bill amount with tax : "+ref5.billAmountWithTax);
System.out.println("Is Tax included : "+ref5.isTaxInclusive);
System.out.println("Is bill paid : "+ref5.isBillPaid);
System.out.println("Is bill over due : "+ref5.isBillOverDue);


Bill ref6=new Bill();
ref6.billId=6;
ref6.planType="Streaming Add-on";
ref6.billAmount=99.00;
ref6.billIssueDate="03-09-2025";
ref6.paymentMethod="Net Banking";
ref6.dueDate="08-09-2025";
ref6.billAmountWithTax=101.97;
ref6.isTaxInclusive=true;
ref6.isBillPaid=true;
ref6.isBillOverDue=false;

System.out.println("The first ref Id : "+ref6.billId);
System.out.println("Bill plan: "+ref6.billAmountWithTax);
System.out.println("Plan type: "+ref6.planType);
System.out.println("Bill amount: "+ref6.billAmount);
System.out.println("Bill issued date: "+ref6.billIssueDate);
System.out.println("Payment method: "+ref6.paymentMethod);
System.out.println("Due date: "+ref6.dueDate);
System.out.println("The bill amount with tax : "+ref6.billAmountWithTax);
System.out.println("Is Tax included : "+ref6.isTaxInclusive);
System.out.println("Is bill paid : "+ref6.isBillPaid);
System.out.println("Is bill over due : "+ref6.isBillOverDue);


Bill ref7=new Bill();
ref7.billId=7;
ref7.planType="Monthly Combo";
ref7.billAmount=350.00;
ref7.billIssueDate="05-09-2025";
ref7.paymentMethod="UPI";
ref7.dueDate="10-09-2025";
ref7.billAmountWithTax=357.50;
ref7.isTaxInclusive=true;
ref7.isBillPaid=false;
ref7.isBillOverDue=true;

System.out.println("The first ref Id : "+ref7.billId);
System.out.println("Bill plan: "+ref7.billAmountWithTax);
System.out.println("Plan type: "+ref7.planType);
System.out.println("Bill amount: "+ref7.billAmount);
System.out.println("Bill issued date: "+ref7.billIssueDate);
System.out.println("Payment method: "+ref7.paymentMethod);
System.out.println("Due date: "+ref7.dueDate);
System.out.println("The bill amount with tax : "+ref7.billAmountWithTax);
System.out.println("Is Tax included : "+ref7.isTaxInclusive);
System.out.println("Is bill paid : "+ref7.isBillPaid);
System.out.println("Is bill over due : "+ref7.isBillOverDue);

Bill ref8=new Bill();
ref8.billId=8;
ref8.planType="Basic Talktime";
ref8.billAmount=150.00;
ref8.billIssueDate="06-09-2025";
ref8.paymentMethod="Cash";
ref8.dueDate="11-09-2025";
ref8.billAmountWithTax=153.00;
ref8.isTaxInclusive=true;
ref8.isBillPaid=true;
ref8.isBillOverDue=false;

System.out.println("The first ref Id : "+ref8.billId);
System.out.println("Bill plan: "+ref8.billAmountWithTax);
System.out.println("Plan type: "+ref8.planType);
System.out.println("Bill amount: "+ref8.billAmount);
System.out.println("Bill issued date: "+ref8.billIssueDate);
System.out.println("Payment method: "+ref8.paymentMethod);
System.out.println("Due date: "+ref8.dueDate);
System.out.println("The bill amount with tax : "+ref8.billAmountWithTax);
System.out.println("Is Tax included : "+ref8.isTaxInclusive);
System.out.println("Is bill paid : "+ref8.isBillPaid);
System.out.println("Is bill over due : "+ref8.isBillOverDue);

Bill ref9=new Bill();
ref9.billId=9;
ref9.planType="OTT Bundle";
ref9.billAmount=399.00;
ref9.billIssueDate="07-09-2025";
ref9.paymentMethod="Card";
ref9.dueDate="12-09-2025";
ref9.billAmountWithTax=407.98;
ref9.isTaxInclusive=true;
ref9.isBillPaid=false;
ref9.isBillOverDue=false;

System.out.println("The first ref Id : "+ref9.billId);
System.out.println("Bill plan: "+ref9.billAmountWithTax);
System.out.println("Plan type: "+ref9.planType);
System.out.println("Bill amount: "+ref9.billAmount);
System.out.println("Bill issued date: "+ref9.billIssueDate);
System.out.println("Payment method: "+ref9.paymentMethod);
System.out.println("Due date: "+ref9.dueDate);
System.out.println("The bill amount with tax : "+ref9.billAmountWithTax);
System.out.println("Is Tax included : "+ref9.isTaxInclusive);
System.out.println("Is bill paid : "+ref9.isBillPaid);
System.out.println("Is bill over due : "+ref9.isBillOverDue);

Bill ref10=new Bill();
ref10.billId=10;
ref10.planType="Annual Recharge";
ref10.billAmount=1299.00;
ref10.billIssueDate="10-09-2025";
ref10.paymentMethod="Net Banking";
ref10.dueDate="20-09-2025";
ref10.billAmountWithTax=1337.97;
ref10.isTaxInclusive=true;
ref10.isBillPaid=false;
ref10.isBillOverDue=false;

System.out.println("The first ref Id : "+ref10.billId);
System.out.println("Bill plan: "+ref10.billAmountWithTax);
System.out.println("Plan type: "+ref10.planType);
System.out.println("Bill amount: "+ref10.billAmount);
System.out.println("Bill issued date: "+ref10.billIssueDate);
System.out.println("Payment method: "+ref10.paymentMethod);
System.out.println("Due date: "+ref10.dueDate);
System.out.println("The bill amount with tax : "+ref10.billAmountWithTax);
System.out.println("Is Tax included : "+ref10.isTaxInclusive);
System.out.println("Is bill paid : "+ref10.isBillPaid);
System.out.println("Is bill over due : "+ref10.isBillOverDue);

Bill ref11=new Bill();
ref11.billId=11;
ref11.planType="Student Offer";
ref11.billAmount=99.00;
ref11.billIssueDate="12-09-2025";
ref11.paymentMethod="Cash";
ref11.dueDate="17-09-2025";
ref11.billAmountWithTax=100.89;
ref11.isTaxInclusive=true;
ref11.isBillPaid=true;
ref11.isBillOverDue=false;

System.out.println("The first ref Id : "+ref11.billId);
System.out.println("Bill plan: "+ref11.billAmountWithTax);
System.out.println("Plan type: "+ref11.planType);
System.out.println("Bill amount: "+ref11.billAmount);
System.out.println("Bill issued date: "+ref11.billIssueDate);
System.out.println("Payment method: "+ref11.paymentMethod);
System.out.println("Due date: "+ref11.dueDate);
System.out.println("The bill amount with tax : "+ref11.billAmountWithTax);
System.out.println("Is Tax included : "+ref11.isTaxInclusive);
System.out.println("Is bill paid : "+ref11.isBillPaid);
System.out.println("Is bill over due : "+ref11.isBillOverDue);

Bill ref12=new Bill();
ref12.billId=12;
ref12.planType="Corporate Plan";
ref12.billAmount=749.00;
ref12.billIssueDate="15-09-2025";
ref12.paymentMethod="UPI";
ref12.dueDate="20-09-2025";
ref12.billAmountWithTax=765.98;
ref12.isTaxInclusive=true;
ref12.isBillPaid=false;
ref12.isBillOverDue=true;

System.out.println("The first ref Id : "+ref12.billId);
System.out.println("Bill plan: "+ref12.billAmountWithTax);
System.out.println("Plan type: "+ref12.planType);
System.out.println("Bill amount: "+ref12.billAmount);
System.out.println("Bill issued date: "+ref12.billIssueDate);
System.out.println("Payment method: "+ref12.paymentMethod);
System.out.println("Due date: "+ref12.dueDate);
System.out.println("The bill amount with tax : "+ref12.billAmountWithTax);
System.out.println("Is Tax included : "+ref12.isTaxInclusive);
System.out.println("Is bill paid : "+ref12.isBillPaid);
System.out.println("Is bill over due : "+ref12.isBillOverDue);


Bill ref13=new Bill();
ref13.billId=13;
ref13.planType="Weekend Plan";
ref13.billAmount=199.00;
ref13.billIssueDate="17-09-2025";
ref13.paymentMethod="Card";
ref13.dueDate="22-09-2025";
ref13.billAmountWithTax=203.98;
ref13.isTaxInclusive=true;
ref13.isBillPaid=true;
ref13.isBillOverDue=false;

System.out.println("The first ref Id : "+ref13.billId);
System.out.println("Bill plan: "+ref13.billAmountWithTax);
System.out.println("Plan type: "+ref13.planType);
System.out.println("Bill amount: "+ref13.billAmount);
System.out.println("Bill issued date: "+ref13.billIssueDate);
System.out.println("Payment method: "+ref13.paymentMethod);
System.out.println("Due date: "+ref13.dueDate);
System.out.println("The bill amount with tax : "+ref13.billAmountWithTax);
System.out.println("Is Tax included : "+ref13.isTaxInclusive);
System.out.println("Is bill paid : "+ref13.isBillPaid);
System.out.println("Is bill over due : "+ref13.isBillOverDue);

Bill ref14=new Bill();
ref14.billId=14;
ref14.planType="SMS Add-on";
ref14.billAmount=49.00;
ref14.billIssueDate="19-09-2025";
ref14.paymentMethod="UPI";
ref14.dueDate="24-09-2025";
ref14.billAmountWithTax=49.98;
ref14.isTaxInclusive=true;
ref14.isBillPaid=false;
ref14.isBillOverDue=false;

System.out.println("The first ref Id : "+ref14.billId);
System.out.println("Bill plan: "+ref14.billAmountWithTax);
System.out.println("Plan type: "+ref14.planType);
System.out.println("Bill amount: "+ref14.billAmount);
System.out.println("Bill issued date: "+ref14.billIssueDate);
System.out.println("Payment method: "+ref14.paymentMethod);
System.out.println("Due date: "+ref14.dueDate);
System.out.println("The bill amount with tax : "+ref14.billAmountWithTax);
System.out.println("Is Tax included : "+ref14.isTaxInclusive);
System.out.println("Is bill paid : "+ref14.isBillPaid);
System.out.println("Is bill over due : "+ref14.isBillOverDue);

Bill ref15=new Bill();
ref15.billId=15;
ref15.planType="Festival Offer";
ref15.billAmount=399.00;
ref15.billIssueDate="20-09-2025";
ref15.paymentMethod="Cash";
ref15.dueDate="25-09-2025";
ref15.billAmountWithTax=407.98;
ref15.isTaxInclusive=true;
ref15.isBillPaid=true;
ref15.isBillOverDue=false;

System.out.println("The first ref Id : "+ref15.billId);
System.out.println("Bill plan: "+ref15.billAmountWithTax);
System.out.println("Plan type: "+ref15.planType);
System.out.println("Bill amount: "+ref15.billAmount);
System.out.println("Bill issued date: "+ref15.billIssueDate);
System.out.println("Payment method: "+ref15.paymentMethod);
System.out.println("Due date: "+ref15.dueDate);
System.out.println("The bill amount with tax : "+ref15.billAmountWithTax);
System.out.println("Is Tax included : "+ref15.isTaxInclusive);
System.out.println("Is bill paid : "+ref15.isBillPaid);
System.out.println("Is bill over due : "+ref15.isBillOverDue);

Bill ref16=new Bill();
ref16.billId=16;
ref16.planType="Voice Only Plan";
ref16.billAmount=299.00;
ref16.billIssueDate="21-09-2025";
ref16.paymentMethod="Card";
ref16.dueDate="26-09-2025";
ref16.billAmountWithTax=305.97;
ref16.isTaxInclusive=true;
ref16.isBillPaid=true;
ref16.isBillOverDue=false;

System.out.println("The first ref Id : "+ref16.billId);
System.out.println("Bill plan: "+ref16.billAmountWithTax);
System.out.println("Plan type: "+ref16.planType);
System.out.println("Bill amount: "+ref16.billAmount);
System.out.println("Bill issued date: "+ref16.billIssueDate);
System.out.println("Payment method: "+ref16.paymentMethod);
System.out.println("Due date: "+ref16.dueDate);
System.out.println("The bill amount with tax : "+ref16.billAmountWithTax);
System.out.println("Is Tax included : "+ref16.isTaxInclusive);
System.out.println("Is bill paid : "+ref16.isBillPaid);
System.out.println("Is bill over due : "+ref16.isBillOverDue);

Bill ref17=new Bill();
ref17.billId=17;
ref17.planType="Roaming Lite";
ref17.billAmount=129.00;
ref17.billIssueDate="22-09-2025";
ref17.paymentMethod="UPI";
ref17.dueDate="27-09-2025";
ref17.billAmountWithTax=131.99;
ref17.isTaxInclusive=true;
ref17.isBillPaid=false;
ref17.isBillOverDue=false;
System.out.println("The first ref Id : "+ref17.billId);
System.out.println("Bill plan: "+ref17.billAmountWithTax);
System.out.println("Plan type: "+ref17.planType);
System.out.println("Bill amount: "+ref17.billAmount);
System.out.println("Bill issued date: "+ref17.billIssueDate);
System.out.println("Payment method: "+ref17.paymentMethod);
System.out.println("Due date: "+ref17.dueDate);
System.out.println("The bill amount with tax : "+ref17.billAmountWithTax);
System.out.println("Is Tax included : "+ref17.isTaxInclusive);
System.out.println("Is bill paid : "+ref17.isBillPaid);
System.out.println("Is bill over due : "+ref17.isBillOverDue);

Bill ref18=new Bill();
ref18.billId=18;
ref18.planType="4G Data Boost";
ref18.billAmount=299.00;
ref18.billIssueDate="24-09-2025";
ref18.paymentMethod="Net Banking";
ref18.dueDate="29-09-2025";
ref18.billAmountWithTax=305.97;
ref18.isTaxInclusive=true;
ref18.isBillPaid=true;
ref18.isBillOverDue=false;

System.out.println("The first ref Id : "+ref18.billId);
System.out.println("Bill plan: "+ref18.billAmountWithTax);
System.out.println("Plan type: "+ref18.planType);
System.out.println("Bill amount: "+ref18.billAmount);
System.out.println("Bill issued date: "+ref18.billIssueDate);
System.out.println("Payment method: "+ref18.paymentMethod);
System.out.println("Due date: "+ref18.dueDate);
System.out.println("The bill amount with tax : "+ref18.billAmountWithTax);
System.out.println("Is Tax included : "+ref18.isTaxInclusive);
System.out.println("Is bill paid : "+ref18.isBillPaid);
System.out.println("Is bill over due : "+ref18.isBillOverDue);


Bill ref19=new Bill();
ref19.billId=19;
ref19.planType="Premium Plan";
ref19.billAmount=999.00;
ref19.billIssueDate="26-09-2025";
ref19.paymentMethod="Cash";
ref19.dueDate="01-10-2025";
ref19.billAmountWithTax=1028.97;
ref19.isTaxInclusive=true;
ref19.isBillPaid=false;
ref19.isBillOverDue=true;

System.out.println("The first ref Id : "+ref19.billId);
System.out.println("Bill plan: "+ref19.billAmountWithTax);
System.out.println("Plan type: "+ref19.planType);
System.out.println("Bill amount: "+ref19.billAmount);
System.out.println("Bill issued date: "+ref19.billIssueDate);
System.out.println("Payment method: "+ref19.paymentMethod);
System.out.println("Due date: "+ref19.dueDate);
System.out.println("The bill amount with tax : "+ref19.billAmountWithTax);
System.out.println("Is Tax included : "+ref19.isTaxInclusive);
System.out.println("Is bill paid : "+ref19.isBillPaid);
System.out.println("Is bill over due : "+ref19.isBillOverDue);

Bill ref20=new Bill();
ref20.billId=20;
ref20.planType="Trial Plan";
ref20.billAmount=0.00;
ref20.billIssueDate="27-09-2025";
ref20.paymentMethod="Card";
ref20.dueDate="30-09-2025";
ref20.billAmountWithTax=0.00;
ref20.isTaxInclusive=true;
ref20.isBillPaid=true;
ref20.isBillOverDue=false;

System.out.println("The first ref Id : "+ref20.billId);
System.out.println("Bill plan: "+ref20.billAmountWithTax);
System.out.println("Plan type: "+ref20.planType);
System.out.println("Bill amount: "+ref20.billAmount);
System.out.println("Bill issued date: "+ref20.billIssueDate);
System.out.println("Payment method: "+ref20.paymentMethod);
System.out.println("Due date: "+ref20.dueDate);
System.out.println("The bill amount with tax : "+ref20.billAmountWithTax);
System.out.println("Is Tax included : "+ref20.isTaxInclusive);
System.out.println("Is bill paid : "+ref20.isBillPaid);
System.out.println("Is bill over due : "+ref20.isBillOverDue);

System.out.println("main ended");

   }

}