package jpabook.jpashop.service.query;

import jpabook.jpashop.api.OrderApiController;
import jpabook.jpashop.domain.Order;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Transactional(readOnly = true)
public class OrderQueryService {

//    public List<OrderDto> orderV3() {
//        List<Order> orders = orderRepository.findAllWithItem();
//        return orders.stream()
//                .map(OrderApiController.OrderDto::new)
//                .collect(Collectors.toList());
//    }
}
