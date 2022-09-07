package designPattern.SolidDesign.OCP;

public interface Notificationservice {

    public void sendOTP(String medium);

    public void sendTransactionReport(String medium);

}

