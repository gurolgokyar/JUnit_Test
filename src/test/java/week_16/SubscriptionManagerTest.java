package test.java.week_16;

import main.java.week_16.SubscriptionManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubscriptionManagerTest {

    static SubscriptionManager subscriptionManager;
    @BeforeAll
    static void setUp(){
        subscriptionManager = new SubscriptionManager();
        System.out.println("The testing is starting");
    }

    @AfterAll
    static void setDown(){
        subscriptionManager = null;
        System.out.println("The testing finished");
    }

    @Test
    void testFreeTierEmailNotificationEnableAutoRenewal(){
        String expected = "Subscription Configured: Tier=FREE, Notification=EMAIL, AutoRenewal=ENABLED";
        String actual = subscriptionManager.configureSubscription(SubscriptionManager.SubscriptionTier.FREE,
                SubscriptionManager.NotificationPreference.EMAIL, SubscriptionManager.AutoRenewal.ENABLED);
        assertEquals(expected, actual,"TC_01: Inputs= {Tier=FREE, Notification=EMAIL, AutoRenewal=ENABLED}");
    }

    @Test
    void testStandardTierSmsNotificationDisableAutoRenewal(){
        String expected = "Subscription Configured: Tier=STANDARD, Notification=SMS, AutoRenewal=DISABLED";
        String actual = subscriptionManager.configureSubscription(SubscriptionManager.SubscriptionTier.STANDARD,
                SubscriptionManager.NotificationPreference.SMS, SubscriptionManager.AutoRenewal.DISABLED);
        assertEquals(expected, actual,"TC_01: Inputs= {Tier=STANDARD, Notification=SMS, AutoRenewal=DISABLED}");
    }

    @Test
    void testPremiumTierNoneNotificationEnableAutoRenewal(){
        String expected = "Subscription Configured: Tier=PREMIUM, Notification=NONE, AutoRenewal=ENABLED";
        String actual = subscriptionManager.configureSubscription(SubscriptionManager.SubscriptionTier.PREMIUM,
                SubscriptionManager.NotificationPreference.NONE, SubscriptionManager.AutoRenewal.ENABLED);
        assertEquals(expected, actual,"TC_01: Inputs= {Tier=PREMIUM, Notification=NONE, AutoRenewal=ENABLED}");
    }

    @Test
    void testFreeTierEsmNotificationDisableAutoRenewal(){
        String expected = "Subscription Configured: Tier=FREE, Notification=SMS, AutoRenewal=DISABLED";
        String actual = subscriptionManager.configureSubscription(SubscriptionManager.SubscriptionTier.FREE,
                SubscriptionManager.NotificationPreference.SMS, SubscriptionManager.AutoRenewal.DISABLED);
        assertEquals(expected, actual,"TC_01: Inputs= {Tier=FREE, Notification=SMS, AutoRenewal=DISABLED}");
    }

    @Test
    void testStandardTierEmailNotificationEnableAutoRenewal(){
        String expected = "Subscription Configured: Tier=STANDARD, Notification=EMAIL, AutoRenewal=ENABLED";
        String actual = subscriptionManager.configureSubscription(SubscriptionManager.SubscriptionTier.STANDARD,
                SubscriptionManager.NotificationPreference.EMAIL, SubscriptionManager.AutoRenewal.ENABLED);
        assertEquals(expected, actual,"TC_01: Inputs= {Tier=STANDARD, Notification=EMAIL, AutoRenewal=ENABLED}");
    }

    @Test
    void testPremiumTierSmsNotificationDisableAutoRenewal(){
        String expected = "Subscription Configured: Tier=PREMIUM, Notification=SMS, AutoRenewal=DISABLED";
        String actual = subscriptionManager.configureSubscription(SubscriptionManager.SubscriptionTier.PREMIUM,
                SubscriptionManager.NotificationPreference.SMS, SubscriptionManager.AutoRenewal.DISABLED);
        assertEquals(expected, actual,"TC_01: Inputs= {Tier=PREMIUM, Notification=SMS, AutoRenewal=DISABLED}");
    }

}
