INSERT INTO posts (title, body, publish_date, author_id)
SELECT 'Franco Scoglio mi gioca a carte','Carte da Briscola', null, id
FROM authors
where firstname = 'Franco'
and lastname = 'Scoglio';

INSERT INTO posts (title, body, publish_date, author_id)
SELECT 'Onorevole Che fuma GANJA','GANJA BUONA', null, id
FROM authors
where firstname = 'Marco'
and lastname = 'Giovanardi';