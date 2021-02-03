FROM node:10.16.1-alpine AS builder
WORKDIR /app
COPY . .
RUN npm install
RUN npm run build --prod

FROM nginx:1.15.8-alpine
COPY /nginx/default.conf /etc/nginx/conf.d/default.conf
COPY --from=builder /app/dist/angular-ecommerce /usr/share/nginx/html
EXPOSE 80