package com.utag.phase1.service.Impl;

import com.utag.phase1.dao.DaoService.TagWholeDao;
import com.utag.phase1.service.TagWholeService;
import com.utag.phase1.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class TagWholeServiceImpl implements TagWholeService {

    @Autowired
    private TagWholeDao tagWholeDao;

    @Override
    public Response<Boolean> saveTagWhole(String imageID, String description) throws IOException{
        Response<Boolean> response = new Response<>();

        if(tagWholeDao.saveTagWhole(imageID, description))
            response.setSuccess(true);
        else
            response.setSuccess(false);

        return response;
    }

    @Override
    public Response<Boolean> deleteTagWhole(String imageID) throws IOException{
        Response<Boolean> response = new Response<>();

        if(tagWholeDao.deleteTagWhole(imageID))
            response.setSuccess(true);
        else
            response.setSuccess(false);

        return response;
    }

    @Override
    public Response<Boolean> updateTagWhole(String imageID, String description) throws IOException{
        Response<Boolean> response = new Response<>();

        if(tagWholeDao.updateTagWhole(imageID, description))
            response.setSuccess(true);
        else
            response.setSuccess(false);

        return response;
    }

    @Override
    public Response<Integer> getDescriptionLength(String imageID) throws IOException {
        Response<Integer> response = new Response<>();

        response.setData(tagWholeDao.getDescriptionLength(imageID));
        return response;
    }
}
