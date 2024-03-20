package cn.itcast.hotel.service;

import cn.itcast.hotel.common.PageResult;
import cn.itcast.hotel.pojo.Hotel;
import cn.itcast.hotel.pojo.RequestDTO;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

public interface IHotelService extends IService<Hotel> {
    PageResult search(RequestDTO requestDTO);

    /**
     * 传入 RequestDTO，根据【query】和【过滤条件】返回结果
     * 
     * @param data
     * @return
     */
    Map<String, List<String>> filters(RequestDTO data);

    List<String> suggestion(String key);

    void insertById(Long id);

    void deleteById(Long id);
}
