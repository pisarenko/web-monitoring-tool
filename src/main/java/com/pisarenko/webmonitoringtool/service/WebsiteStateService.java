package com.pisarenko.webmonitoringtool.service;

import com.pisarenko.webmonitoringtool.model.Website;
import com.pisarenko.webmonitoringtool.model.WebsiteState;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface WebsiteStateService {

    WebsiteState getState(Website website);

    List<WebsiteState> getStates(List<Website> websites);

    ResponseEntity<String> getUrlResponse(Website website);

    long getContentLength(ResponseEntity<String> response);

    String getResponseCode(ResponseEntity<String> response);

    double getResponseTime(Website website);

    WebsiteState getStateById(String id);

    boolean isWebsiteActive(Website website);

}
