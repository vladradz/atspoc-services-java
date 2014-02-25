package com.itv.atspoc.campaign;

import com.google.common.collect.Lists;
import com.itv.atspoc.model.Campaign;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by neilmoor on 20/02/14.
 */
@RestController
public class CampaignController {

    @RequestMapping(value = "/campaigns", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Campaign> getCampaigns() {
        return Lists.newArrayList(new Campaign("Campaign 1"), new Campaign("Campaign 2"), new Campaign("Campaign 3"), new Campaign("Campaign 4"));
    }

    @RequestMapping(value = "/campaigns/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Campaign getCampaign(@PathVariable String id) {
        return new Campaign("Campaign " + id);
    }

}
