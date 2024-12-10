package com.honnappa.Optionals;

import java.util.List;
import java.util.Optional;

public class FindFriendServiceEmpty {

    public Optional<Friend> fiendFriend(String friendName){
        List<Friend> friends = List.of(
                new Friend(123l,"Honnappa",25,1245),
                new Friend(1232l,"Mallu",27,1247),
                new Friend(1234l,"Muttu",35,1248),
                new Friend(12345l,"Sahana",25,1249));

        Optional<Friend> friendFound = Optional.empty();
        for(Friend friend : friends){
            if(friendName.equals(friend.getName())){
                friendFound= Optional.ofNullable(friend);
            }
        }
        return friendFound;
    }
}
