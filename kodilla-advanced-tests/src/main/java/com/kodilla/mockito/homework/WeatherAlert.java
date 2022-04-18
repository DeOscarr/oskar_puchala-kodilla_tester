package com.kodilla.mockito.homework;

import com.kodilla.mockito.Notification;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WeatherAlert {

    private final Map<Location, List<HomeworkClient>> notifications = new HashMap<>();

    public void addSubscriberToLocation(Location location, HomeworkClient client) { //osoba zapisana do lokalizacji, otrzymuje powiadomienia
        if (notifications.containsKey(location)) {
            notifications.get(location).add(client);
        } else {
            List<HomeworkClient> clients = new ArrayList<>();
            clients.add(client);
            notifications.put(location, clients);
        }
    }

    public void sendNotifications(Notification notification, Location location) { //powiadomienie do kleintow danej lokalizacji
        if (notifications.containsKey(location)) {
            notifications.get(location).forEach(client -> client.receive(notification));
        }
    }



    public void sendNotificationsToAllClients(Notification notification) { //powiadomienie do wszystkich //TODO
         notifications.values().stream()
                 .flatMap(list -> list.stream())
                 //.distinct()
                 .collect(Collectors.toSet())
                 .forEach(client -> client.receive(notification));

    }



    public void removeSubscribedLocation(HomeworkClient client, Location location) { //cofniecie subskrybcji z danej lokalizacji
        if (notifications.containsKey(location)) {
            notifications.get(location).remove(client);
        }

    }

    public void removeClientFromAllLocations(HomeworkClient client) {  //usuwa klienta ze wszystkich lokalizacji, nie otrzymuje powiadomien
        notifications.values().forEach(clients -> clients.remove(client));
    }

    public void removeLocation(Location location) { //kasacja lokalizacji
        this.notifications.remove(location);
    }
}