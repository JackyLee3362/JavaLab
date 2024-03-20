package cn.itcast.hotel.common;

import cn.itcast.hotel.pojo.HotelDoc;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageResult {
    private long total;
    private List<HotelDoc> hotels;
}
