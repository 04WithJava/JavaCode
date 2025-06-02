public class restaurantMain {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Customer customer = new Customer();

        employee.open();
        employee.order();
        employee.give();
        
        customer.eat(employee);
        if (employee.pick.equals("짜장면")) {
            System.out.println("현재 소빈의 위: " + customer.lee + " | 짜장면을 먹고 위 용량이 5 줄었습니다");
            customer.lee -= 5;
            System.out.println("음식을 먹고난 후 위: " + customer.lee);
        } else if (employee.pick.equals("짬뽕")) {
            System.out.println("현재 소빈의 위: " + customer.lee + " | 짬뽕을 먹고 위 용량이 4 줄었습니다");
            customer.lee -= 4;
            System.out.println("음식을 먹고난 후 위: " + customer.lee);
        } else if (employee.pick.equals("탕수육")) {
            System.out.println("현재 소빈의 위: " + customer.lee + " | 탕수육을 먹고 위 용량이 8 줄었습니다");
            customer.lee -= 8;
            System.out.println("음식을 먹고난 후 위: " + customer.lee);
        }

        employee.count();
        customer.pay(employee);

    }
}
