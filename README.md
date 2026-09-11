# EventHub — Administração de Eventos

Monorepo com frontend React e API REST Spring Boot. O fluxo inclui cadastro e login de administradores, JWT, e gestão de eventos associada ao administrador autenticado.

## Executar

```powershell
# API (porta 8080; banco H2 em memória)
cd backend
mvn spring-boot:run

# Frontend (porta 5173)
cd ../frontend
npm install
npm run dev
```

Abra `http://localhost:5173`. A documentação Swagger fica em `http://localhost:8080/swagger-ui/index.html`.

> Configure `JWT_SECRET` em produção. O H2 console de desenvolvimento está em `/h2-console`.
