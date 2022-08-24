package com.luo.edu.service.impl;

import com.luo.edu.entity.Video;
import com.luo.edu.mapper.VideoMapper;
import com.luo.edu.service.VideoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 课程视频 服务实现类
 * </p>
 *
 * @author luo
 * @since 2022-08-24
 */
@Service
public class VideoServiceImpl extends ServiceImpl<VideoMapper, Video> implements VideoService {

}
