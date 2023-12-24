package main.java.week_16;

public class SubscriptionManager {

    public enum SubscriptionTier { FREE, STANDARD, PREMIUM }
    public enum NotificationPreference { EMAIL, SMS, NONE }
    public enum AutoRenewal { ENABLED, DISABLED }

    public String configureSubscription(SubscriptionTier tier,
                                        NotificationPreference notification, AutoRenewal autoRenewal) {
// Logic to configure the subscription based on the options
        return "Subscription Configured: Tier=" + tier + ", Notification="
                + notification + ", AutoRenewal=" + autoRenewal;
    }
}
