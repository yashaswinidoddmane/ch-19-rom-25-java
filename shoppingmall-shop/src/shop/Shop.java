package shop;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Shop {
    private String shopName;
    private int shopId;
    private String location;
    private String shopOwner;
    private String mallName;
}
