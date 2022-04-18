package com.kodilla.mockito.homework;

import com.kodilla.mockito.Notification;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class WeatherAlertTestSuit {

    WeatherAlert weatherAlert = new WeatherAlert();
    HomeworkClient client = Mockito.mock(HomeworkClient.class);
    Location location = Mockito.mock(Location.class);
    Notification notification = Mockito.mock(Notification.class);

    @Test
    public void subscribedClientShouldReceivedNotificationFromSpecificLocation() {
        weatherAlert.addSubscriberToLocation(location, client);
        weatherAlert.sendNotifications(notification, location);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
    }

    @Test
    public void shouldAddClientToExistingLocation() {
        weatherAlert.addSubscriberToLocation(location, client);
        HomeworkClient client1 = Mockito.mock(HomeworkClient.class);
        weatherAlert.addSubscriberToLocation(location, client1);

        weatherAlert.sendNotifications(notification, location);
        Mockito.verify(client1, Mockito.times(1)).receive(notification);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
    }

    @Test
    public void unsubscribedLocationByClientShouldNotSentNotificationToClient() {
        Location warsaw = Mockito.mock(Location.class);
        weatherAlert.addSubscriberToLocation(location, client);
        weatherAlert.addSubscriberToLocation(warsaw, client);
        weatherAlert.removeSubscribedLocation(client, location);

        weatherAlert.sendNotifications(notification, location);
        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    public void shouldReceiveNotificationFromNotDeletedLocation() {
        Location warsaw = Mockito.mock(Location.class);
        weatherAlert.addSubscriberToLocation(location, client);
        weatherAlert.addSubscriberToLocation(warsaw, client);
        weatherAlert.removeSubscribedLocation(client, location);

        weatherAlert.sendNotifications(notification, warsaw);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
    }

    @Test
    public void unsubscribedAllLocationShouldDeletedClientFromNotification() {
        Location warsaw = Mockito.mock(Location.class);
        weatherAlert.addSubscriberToLocation(location, client);
        weatherAlert.addSubscriberToLocation(warsaw, client);
        weatherAlert.removeClientFromAllLocations(client);

        weatherAlert.sendNotifications(notification, location);
        weatherAlert.sendNotifications(notification, warsaw);
        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    public void notificationFromSpecificLocationShouldBeSentOnlyToSpecificClient() {
        HomeworkClient client1 = Mockito.mock(HomeworkClient.class);
        HomeworkClient client2 = Mockito.mock(HomeworkClient.class);
        Location london = Mockito.mock(Location.class);
        weatherAlert.addSubscriberToLocation(london, client);
        weatherAlert.addSubscriberToLocation(london, client1);
        weatherAlert.addSubscriberToLocation(location, client2);

        weatherAlert.sendNotifications(notification, london);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
        Mockito.verify(client1, Mockito.times(1)).receive(notification);
        Mockito.verify(client2, Mockito.never()).receive(notification);
    }

    @Test
    public void notificationShouldBeSentToAllSubscribedClient() {
        HomeworkClient client1 = Mockito.mock(HomeworkClient.class);
        HomeworkClient client2 = Mockito.mock(HomeworkClient.class);
        Location london = Mockito.mock(Location.class);
        weatherAlert.addSubscriberToLocation(london, client);
        weatherAlert.addSubscriberToLocation(london, client1);
        weatherAlert.addSubscriberToLocation(location, client2);
        weatherAlert.addSubscriberToLocation(london, client2);

        weatherAlert.sendNotificationsToAllClients(notification);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
        Mockito.verify(client1, Mockito.times(1)).receive(notification);
        Mockito.verify(client2, Mockito.times(1)).receive(notification);


    }

    @Test
    public void shouldDeletedSpecificLocation() { //TODO
        HomeworkClient client1 = Mockito.mock(HomeworkClient.class);
        HomeworkClient client2 = Mockito.mock(HomeworkClient.class);
        Location london = Mockito.mock(Location.class);
        weatherAlert.addSubscriberToLocation(london, client);
        weatherAlert.addSubscriberToLocation(london, client1);
        weatherAlert.addSubscriberToLocation(location, client2);
        weatherAlert.removeLocation(london);
        weatherAlert.sendNotificationsToAllClients(notification);
        Mockito.verify(client, Mockito.never()).receive(notification);
        Mockito.verify(client1, Mockito.never()).receive(notification);
        Mockito.verify(client2, Mockito.times(1)).receive(notification);
    }

}