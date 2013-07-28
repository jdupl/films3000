package gestionDonnees.donnees;

import java.util.ArrayList;

import modeles.films.Duree;
import modeles.films.Film;
import modeles.films.GenreFilm;
import modeles.films.Pays;
import modeles.films.Personne;
import modeles.images.Affiche;
import modeles.images.Fond;
import modeles.images.Image;


public interface GestionFilm {
	public boolean open();

	public boolean close();

	public Film getFilmBase(int id);

	public Film getFilmComplet(int id);

	public ArrayList<Film> getToutFilms();
	
	public boolean idPersonneExiste(int idPersonne);
	
	public boolean idFilmExiste(int idFilm);
	
	public boolean idgenreExiste(int idGenre);
	
	public boolean isoPaysExiste(String iso);
	
	public void supprimerDuree(int idTmdbFilm, int idVersion);
	
	public void supprimerFilm(Film film);
	
	public void supprimerImage(Image image);
	
	public void supprimerPersonne(Personne personne);
	
	public void supprimerDuree(Duree duree);
	
	public void supprimerGenre(GenreFilm genre);

	public void insererFilm(Film film);

	public void insererPersonne(Personne personne);

	public void insererGenre(GenreFilm genre);

	public void insererDuree(Duree duree);
	
	public void insererImage(Image image);

	public void insererPays(Pays pays);

	public ArrayList<Duree> getDurees(int id);

	public ArrayList<Affiche> getAffichesFilm(int id);

	public ArrayList<Fond> getFondsFilm(int id);

	public ArrayList<Personne> getPersonnesFilm(int id);

	public Personne getPersonneBase(int id);

}
