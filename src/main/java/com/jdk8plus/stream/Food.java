package com.stream;

/**
 * * @author lihaocheng
 * * @createtime 2021/8/23
 */
public class Food {
    private String foodName;
    private Integer calories;

    public Food(String foodName, Integer calories) {
        this.foodName = foodName;
        this.calories = calories;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }
}
