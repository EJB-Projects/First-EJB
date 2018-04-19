package com.antonromanov.ejb;

import javax.ejb.Remote;


@Remote
public interface SimpleBeanRemote {

    String getMessage();

}
