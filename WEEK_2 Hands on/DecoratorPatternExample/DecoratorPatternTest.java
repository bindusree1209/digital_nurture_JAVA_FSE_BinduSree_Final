public class DecoratorPatternTest {

    public static void main(String[] args) {

        Notifier emailNotifier = new EmailNotifier();

        System.out.println("Email Notification:");
        emailNotifier.send("Hello!");

        System.out.println();

        Notifier emailAndSMS =
                new SMSNotifierDecorator(new EmailNotifier());

        System.out.println("Email + SMS Notification:");
        emailAndSMS.send("Hello!");

        System.out.println();

        Notifier emailSMSAndSlack =
                new SlackNotifierDecorator(
                        new SMSNotifierDecorator(
                                new EmailNotifier()));

        System.out.println("Email + SMS + Slack Notification:");
        emailSMSAndSlack.send("Hello!");

    }

}