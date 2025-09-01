<h1 align="center">🥛🧀 E-Commerce Dairy Products CateLog</h1>

<h3 align="center">
  <img src="https://img.shields.io/badge/Frontend-React-blue?logo=react" alt="React"/>
  <img src="https://img.shields.io/badge/Backend-Spring%20Boot-brightgreen?logo=springboot" alt="Spring Boot"/>
  <img src="https://img.shields.io/badge/Database-MySQL-blue?logo=mysql" alt="MySQL"/>
  <img src="https://img.shields.io/badge/API-REST%20API-orange" alt="REST API"/>
</h3>

---

<h2>📌 Project Overview</h2>
<p>
A <b>full-stack e-commerce web application</b> for dairy products, allowing users to browse, search, and filter items efficiently. The project integrates 
<b>React (frontend)</b>, <b>Spring Boot (backend)</b>, and <b>MySQL (database)</b> to deliver a <b>responsive and scalable shopping experience</b>.
</p>

---

<h2>🚀 Key Features Implemented</h2>

<h3>1. Preloaded Data with DataSeeder</h3>
<ul>
  <li>Used <b>Spring Boot DataSeeder</b> to auto-insert sample products and categories at application startup.</li>
  <li>Eliminated manual setup, ensuring consistent demo/test environments.</li>
</ul>

<h3>2. Dynamic Data Fetching with React Hooks</h3>
<ul>
  <li>Used <b>useEffect</b> hook to call backend APIs dynamically when components render.</li>
  <li>Integrated <b>Fetch API</b> to asynchronously retrieve products, ensuring smooth user interactions.</li>
</ul>

<h3>3. Category Filter for Quick Navigation</h3>
<ul>
  <li>Built an <b>intuitive category filter</b> on the frontend to display products by type (e.g., milk, cheese, butter).</li>
  <li>Optimized backend queries for efficient filtering.</li>
</ul>

<h3>4. Smart Search Functionality</h3>
<ul>
  <li>Designed a <b>real-time search feature</b> to help users quickly locate products by name or keyword.</li>
  <li>Enhanced backend queries using SQL <code>LIKE</code> operations for better search accuracy.</li>
</ul>

---

<h2>⚡ How to Run the Application</h2>

<h3>Backend (Spring Boot + MySQL)</h3>
<ol>
  <li>Clone the repository</li>
  <li>Set up <b>MySQL database</b> and update credentials in <code>application.properties</code></li>
  <li>Run the Spring Boot application (<code>mvn spring-boot:run</code> or from your IDE)</li>
  <li>Verify backend is running at <code>http://localhost:8080</code></li>
</ol>

<h3>Frontend (React)</h3>
<pre>
npm install
npm run dev
</pre>
<p>The application will start at <code>http://localhost:5173</code> (default Vite port).</p>

---

<h2>🏆 Outcome / Highlights</h2>
<ul>
  <li>Delivered a <b>production-ready full-stack application</b>.</li>
  <li>Showcased <b>React state management, hooks, and API integration</b>.</li>
  <li>Demonstrated <b>Spring Boot REST API development and database seeding techniques</b>.</li>
  <li>Proved ability to <b>integrate frontend, backend, and database seamlessly</b>.</li>
</ul>
