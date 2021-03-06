package com.utag.phase1.service.Impl;

import com.utag.phase1.dao.DaoService.TagPartDao;
import com.utag.phase1.domain.TagPart;
import com.utag.phase1.service.TagPartService;
import com.utag.phase1.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
@Service
public class TagPartServiceImpl implements TagPartService {
    @Autowired
    private TagPartDao tagPartDao;

    @Override
    public Response<Boolean> saveTagPart(String imageID, double x1, double x2, double y1, double y2, String description){
        try{
            tagPartDao.saveTagPart(imageID, x1, x2, y1, y2, description);
            return new Response<>(true, "Succeed to save user!");
        }catch (Exception e){
            e.printStackTrace();
            return new Response<>(false, "Fail to save user!");
        }
    }

    @Override
    public Response<List<TagPart>> showTagPart(String imageID) throws IOException{
        try{
            return new Response<>(true, tagPartDao.showTagPart(imageID));
        }catch (Exception e){
            e.printStackTrace();
            return new Response<>(false, "Fail to show part tag!");
        }
    }

    @Override
    public Response<Boolean> deleteTagPart(String imageID)throws IOException {
        try{
            tagPartDao.deleteTagPart(imageID);
            return new Response<>(true, "Succeed to delete part tag!");
        }catch (Exception e){
            e.printStackTrace();
            return new Response<>(false, "Fail to delete part tag!");
        }
    }

    @Override
    public Response<Boolean> updateTagPart(String imageID, double x1, double x2,
                                           double y1, double y2, String description) throws IOException {
        try {
            tagPartDao.updateTagPart(imageID, x1, x2, y1, y2, description);
            return new Response<>(true, "Succeed to update the part tag!");
        }catch (Exception e) {
            e.printStackTrace();
            return new Response<>(false, "Fail to update the part tag!");
        }
    }

    @Override
    public Response<Integer> getDescriptionLength(String imageID, double x1,
                                                  double x2, double y1, double y2) throws IOException {
        Response<Integer> response = new Response<>();
        response.setData(tagPartDao.getDescriptionLength(imageID, x1, x2, y1, y2));
        return response;
    }


}
