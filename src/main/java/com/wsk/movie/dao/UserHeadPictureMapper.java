package com.wsk.movie.dao;

import com.wsk.movie.pojo.UserHeadPicture;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserHeadPictureMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserHeadPicture record);

    int insertSelective(UserHeadPicture record);

    UserHeadPicture selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserHeadPicture record);

    int updateByPrimaryKey(UserHeadPicture record);
}