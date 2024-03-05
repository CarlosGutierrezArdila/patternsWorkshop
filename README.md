# patternsWorkshop

```
curl --location 'localhost:8080/api/v1/items/changeStatus' \
--header 'Content-Type: application/json' \
--data '{
    "itemId": "MLA666",
    "siteId": "CBT",
    "currentStatus": "green",
    "newStatus": "yellow"
}'
```
