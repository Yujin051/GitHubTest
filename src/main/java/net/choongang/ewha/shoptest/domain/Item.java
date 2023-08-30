package net.choongang.ewha.shoptest.domain;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import net.choongang.ewha.shoptest.costant.itemSellStatus;

@Entity
@Table(name="product")
@Getter
@Setter
public class Item {
	
	@Id
	@Column(name="p_num")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable=false, length=50)
	private String productName;
	
	@Column(name="price", nullable=false)
	private int price;
	
	@Column(nullable=false)
	private int stockNumber;
	
	@Enumerated(EnumType.STRING)
	private itemSellStatus itemSellStatus;
	
	private LocalDateTime regTime;
	
	private LocalDateTime updateTime;
}
