const navButtons = document.querySelectorAll('.nav-btn');
const sections = document.querySelectorAll('.section');

function showSection(sectionId) {
  sections.forEach((section) => {
    if (section.id === sectionId) {
      section.classList.add('visible');
      section.setAttribute('tabindex', '0');
      section.focus();
    } else {
      section.classList.remove('visible');
      section.setAttribute('tabindex', '-1');
    }
  });

  navButtons.forEach((btn) => {
    if (btn.dataset.target === sectionId) {
      btn.classList.add('active');
      btn.setAttribute('aria-current', 'page');
    } else {
      btn.classList.remove('active');
      btn.removeAttribute('aria-current');
    }
  });
}

// Show home by default on page load
document.addEventListener('DOMContentLoaded', () => {
  showSection('home');

  navButtons.forEach((btn) => {
    btn.addEventListener('click', () => {
      showSection(btn.dataset.target);
    });
  });
});
