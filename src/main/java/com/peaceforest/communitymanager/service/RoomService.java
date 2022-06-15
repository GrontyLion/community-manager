package com.peaceforest.communitymanager.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.peaceforest.communitymanager.entity.Room;
import com.peaceforest.communitymanager.mapper.RoomMapper;
@Service
public class RoomService extends ServiceImpl<RoomMapper, Room> {

}
