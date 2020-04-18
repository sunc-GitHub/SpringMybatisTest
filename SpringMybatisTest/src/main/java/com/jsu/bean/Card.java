package com.jsu.bean;

/**
 * @Auther: next door
 * @Date: 2020/4/2 00:16
 * @Description:
 */
public class Card {

    private String id;
    private String card;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id='" + id + '\'' +
                ", card='" + card + '\'' +
                '}';
    }
}
