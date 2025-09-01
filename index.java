// Smooth scrolling for navigation
document.querySelectorAll("nav a").forEach(link => {
  link.addEventListener("click", e => {
    e.preventDefault();
    document.querySelector(link.getAttribute("href")).scrollIntoView({
      behavior: "smooth"
    });
  });
});

// Contact form functionality
document.getElementById("contactForm").addEventListener("submit", e => {
  e.preventDefault();
  alert("Your message has been sent successfully!");
});
