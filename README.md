# 다노샵 클론코딩

**[프로젝트의 목적]**  
기간:일주일, 현재 서비스 중인 사이트중 다노샵을 선택하여 최대한 근접하게 클론코딩을 진행

## 준비과정

다노샵에서 동작되고 있는 기능들을 찾아보고, Frontend와 Backed간 연결구조를 초기에 구상한다.

### Prerequisites / 선행 조건

DB:

```
Mysql(Amazon RDS)
```

Crwaling:

```
Python Selenium
```

Server:

```
Amazon EC2 Ubuntu
```

개발 환경:
```
Spring
```

### DB Schema

Cart
```
id
created_at
modified_at
amount
img_url
price
product_name
username
```

My_Order
```
id
created_at
modified_at
amount
img_url
price
product_name
username
```

product
```
id
image_url
product_name
price
is_trending
is_dano
is_best_deal
is_free
is_new
```

User
```
id
created_at
modified_at
email
name
phone
role
username
raw_pasword
```


## Server API URL

회원가입 api
```
/user/signup	POST
```

로그인 api
```
/api/login	POST
```

로그인된 사용자 정보 api
```
/api/getUser	POST
```

회원정보 수정 api
```
/api/userEdit	PUT
```

회원탈퇴 api
```
/api/unregister/{username}	Delete
```

바로 주문하기 api
```
/api/DirectOrder/{username}	POST
```

전체 상품 목록 api
```
/api/product	GET
```

장바구니에 상품담기 api
```
/api/cart	POST
```

장바구니 상품빼기 api
```
/api/cart/{username}/removeItem/{id}	Delete
```

주문하기
```
/api/MyOrder/{username}	POST
```

내 주문내역 api
```
/api/MyOrder/{username}	GET
```

## Deployment / 배포

배포과정
```
gradel build -> .jar -> deploy
```

## Built With / 누구랑 만들었나요?
Fronend
* [노유진](https://github.com/noh-yj)
* [여지영](https://github.com/Jennayeo)

Backend
* [최재성](https://github.com/unkwn22)
* [윤현동](https://github.com/rincher)

##Frontend page
[dano-clone](https://github.com/noh-yj/dano-clone)
