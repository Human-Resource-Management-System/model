package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import models.Candidate;

@Repository
public class CandidateDAOImpl implements CandidateDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional
	public void saveCandidate(Candidate candidate) {
		entityManager.persist(candidate);
	}

	@Override
	@Transactional
	public Candidate getCandidateById(int candidateId) {
		return entityManager.find(Candidate.class, candidateId);
	}

	@Override
	@Transactional
	public List<Object[]> getAllCandidates() {
		String query = "SELECT c.candId, c.candFirstName, c.candMiddleName, c.candLastName FROM Candidate c";
		return entityManager.createQuery(query, Object[].class).getResultList();
	}
}
